//package com.bilgeadam.like.config.audit;
// /**
// * @author stkey
// * @since 29.03.2023
// */
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.Optional;
//
//
//public class AuditorAwareImpl implements AuditorAware<String> {
//    /**
//     * @return Konfigüre edilmiş Auditor döner
//     */
////    @Override
////    public Optional<String> getCurrentAuditor() {
////        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////        if (authentication == null || !authentication.isAuthenticated()) {
////            return Optional.empty();
////        }
////        return Optional.ofNullable(((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername());
////    }
//}
